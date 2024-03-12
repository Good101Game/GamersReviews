$(document).ready(function () {
    // Fetch data using AJAX

    // Function to add row to the table
    function addRow(review) {
        $("#reviewsTable").append("<tr>" +
            "<td>" + review.userid + "</td>" +
            "<td>" + review.userName + "</td>" +
            "<td>" + review.Gid + "</td>" +
            "<td>" + review.Gname + "</td>" +
            "<td>" + review.realese_date + "</td>" +
            "<td>" + review.subject + "</td>" +
            "<td>" + review.content + "</td>" +
            "<td>" + review.stars + "</td>" +
            "</tr>");
    }

    // Fetch all reviews on page load
    $.ajax({
        type: "GET",
        url: "/Review/getAllReviews",
        success: function (reviews) {
            const reviewsTable = $("#reviewsTable");
            reviews.forEach(function (review) {
                addRow(review);
            });
        },
        error: function (error) {
            console.error("Error fetching review data: ", error);
        }
    });

    // Form submission for adding a new review
    $("#reviewForm").submit(function (event) {
        event.preventDefault();
        let review = {
            userid: $("#userid").val(),
            userName: $("#userName").val(),
            Gid: $("#Gid").val(),
            Gname: $("#Gname").val(),
            realese_date: $("#realese_date").val(),
            subject: $("#subject").val(),
            content: $("#content").val(),
            stars: $("#stars").val()
        };

        // AJAX POST request to add a new review
        $.ajax({
            type: "POST",
            url: "/Review/addReview",
            contentType: "application/json",
            data: JSON.stringify(review),
            success: function () {
                alert("Review saved successfully!");
                addRow(review);
            },
            error: function (error) {
                console.log("Error saving review: ", error);
            }
        });
    });
});
