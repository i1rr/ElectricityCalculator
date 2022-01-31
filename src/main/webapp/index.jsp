<!DOCTYPE html>
<html lang="en" xml:lang="en">
<head>
    <!-- Required meta tags -->
    <meta content="text/html" charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
          crossorigin="anonymous">

    <script   src="https://code.jquery.com/jquery-3.6.0.js"
              integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
              crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
            integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
            integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="styles/style.css">

    <title>Your favourite electricity calculator</title>
</head>
<body>
<div class="flex-container">
    <div class="child">
        <p>Daily charge</p>
    </div>
    <div class="child">
        <input type="number" required="required" name="dailyChargePrice" id="dailyChargePrice" min="0" placeholder="Unit price" step=".01">
    </div>
    <div>
        <input type="number" required="required" name="dailyChargeUsage" min="0" placeholder="Usage" step=".01">
    </div>
</div>
<div class="flex-container">
    <div class="child">
        <p>Off Peak</p>
    </div>
    <div class="child">
        <input type="number" required="required" name="offPeakPrice" id="offPeakPrice" min="0" placeholder="Unit price" step=".01">
    </div>
    <div class="child">
        <input type="number" required="required" name="offPeakUsage" min="0" placeholder="Usage" step=".01">
    </div>
</div>
<div class="flex-container">
    <div class="child">
        <p>Peak</p>
    </div>
    <div class="child">
        <input type="number" required="required" name="peakPrice" id="peakPrice" min="0" placeholder="Unit price" step=".01">
    </div>
    <div class="child">
        <input type="number" required="required" name="peakUsage" min="0" placeholder="Usage" step=".01">
    </div>
</div>
<div class="flex-container">
    <div class="child">
        <p>Shoulder</p>
    </div>
    <div class="child">
        <input type="number" required="required" name="shoulderPrice" id="shoulderPrice" min="0" placeholder="Unit price" step=".01">
    </div>
    <div class="child">
        <input type="number" required="required" name="shoulderUsage" min="0" placeholder="Usage" step=".01">
    </div>
</div>
<input type="submit">
</body>
</html>
