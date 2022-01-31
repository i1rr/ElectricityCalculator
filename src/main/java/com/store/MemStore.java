package com.store;

import com.model.ElecBill;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MemStore implements Store {
    private static final MemStore INSTANCE = new MemStore();

    private static final AtomicInteger BILL_ID = new AtomicInteger();

    private final Map<Integer, ElecBill> bills = new ConcurrentHashMap<>();

    public static MemStore instOf() {
        return INSTANCE;
    }

    public Collection<ElecBill> findAllBills() {
        return bills.values();
    }

    public void save(ElecBill bill) {
        if (bill.getId() == 0) {
            bill.setId(BILL_ID.incrementAndGet());
        }
        bills.put(bill.getId(), bill);
    }

    public ElecBill findBillById(int id) {
        return bills.get(id);
    }

    public void deleteBill(int id) {
        bills.remove(id);
    }
}
