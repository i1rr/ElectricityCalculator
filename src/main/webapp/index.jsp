<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <meta charset="UTF-8" />
    <title>User Info</title>
</head>
<body>
<p>Daily: price: <%= request.getParameter("dailyChargePrice") %> kWh: <%= request.getParameter("dailyChargeUsage") %>  full price: </p>
<p>Off Peak: price: <%= request.getParameter("offPeakPrice") %> kWh: <%= request.getParameter("offPeakUsage") %></p>
<p>Peak: price: <%= request.getParameter("peakPrice") %> kWh: <%= request.getParameter("peakUsage") %></p>
<p>Shoulder: price: <%= request.getParameter("shoulderPrice") %> kWh: <%= request.getParameter("shoulderUsage") %></p>

</body>
</html>