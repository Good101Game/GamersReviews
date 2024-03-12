$(document).ready(function () {

    function addRow(genre) {
        $("#genresList").append("<tr><td>" + genre.name + "</td>" +
            "<td>" +
            "<button onclick='findGenreById(" + genre.name + ")'>" + "View Games" + "</button>" +
            "</td>"+
            "</tr>");
    }

    $.ajax({
        type: "GET",
        url: "/Genre/getAllGenre",
        success: function (genres) {
            const genresList = $("#GenresList");
            genres.forEach(function (genre) {
                addRow(genre);
            });
        },
        error: function (error) {
            console.error("Error fetching genre data: ", error);
        }
    });

    $("#genreForm").submit(function (event) {
        event.preventDefault();
        let Genre = {
            name: $("#GenreName").val(),
        };

        $.ajax({
            type: "POST",
            url: "/Genre/addGenre",
            contentType: "application/json",
            data: JSON.stringify(Genre),
            success: function () {
                alert("Genre saved successfully!");
                addRow(genre);
            },
            error: function (error) {
                console.log("Error saving genre: ", error);
            }
        });
    });
});

function findGenreById(name) {
    $.ajax({
        type: "GET",
        url: "/genres/findGenreById/" + name,
        success: function (genre) {
            alert("Genre found successfully: " + genre.name);
            // You can redirect to a page to display the games related to this genre
            // window.location.href = "/games.html?genre=" + encodeURIComponent(genre.name);
        },
        error: function (error) {
            console.log("Error finding genre: ", error);
        }
    });
}
