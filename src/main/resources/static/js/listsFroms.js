$(document).ready(function () {


    function addRow(list) {
        $("#listsTable").append("<tr>" +
            "<td>" + list.playing + "</td>" +
            "<td>" + list.completed + "</td>" +
            "<td>" + list.on_hold + "</td>" +
            "<td>" + list.dropped + "</td>" +
            "<td>" + list.want_to_play + "</td>" +
            "</tr>");
    }

    $.ajax({
        type: "GET",
        url: "/lists/getAll",
        success: function (lists) {
            const listsTable = $("#listsTable");
            lists.forEach(function (Lists) {
                addRow(Lists);
            });
        },
        error: function (error) {
            console.error("Error fetching lists data: ", error);
        }
    });

    $("#listForm").submit(function (event) {
        event.preventDefault();
        let list = {
            playing: $("#playing").val(),
            completed: $("#completed").val(),
            on_hold: $("#on_hold").val(),
            dropped: $("#dropped").val(),
            want_to_play: $("#want_to_play").val()
        };

        $.ajax({
            type: "POST",
            url: "/Lists/addList",
            contentType: "application/json",
            data: JSON.stringify(list),
            success: function () {
                alert("List saved successfully!");
                addRow(list);
            },
            error: function (error) {
                console.log("Error saving list: ", error);
            }
        });
    });
});
