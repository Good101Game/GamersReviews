$(document).ready(function () {
    // Fetch data using AJAX

    function addRow(game) {
        $("#gamesList").append("<tr><td>" + game.Gid + "</td>" +
            "<td>" + game.Gname + "</td>" +
            "<td>" + game.realese_date + "</td>" +
            "<td>" + game.imageUrl + "</td>" +
            "<td>" +
            "<button onclick='findGamesById(" + game.Gid + ")'>" + "Details" + "</button>" +
            "</td>" +
            "</tr>");
    }

    $.ajax({
        type: "GET",
        url: "/Games/getAllGames", // Assuming this endpoint returns all games
        success: function (Games) {
            // Iterate through the games and display them in the table
            const gamesList = $("#gamesList");
            games.forEach(function (game) {
                addRow(game);
            });
        },
        error: function (error) {
            console.error("Error fetching game data: ", error);
        }
    });

    $("#gameForm").submit(function (event) {
        event.preventDefault();
        let Game = {
            Gname: $("#gameName").val(),
            realese_date: $("#releaseDate").val(),
            imageUrl: $("#imageUrl").val()
        };

        $.ajax(
        {
            type: "POST",
            url: "/Games/addGame", // Assuming this endpoint adds a new game
            contentType: "application/json",
            data: JSON.stringify(game),
            success: function () {
                alert("Game saved successfully!");
                addRow(Game);
            },
            error: function (error) {
                console.log("Error saving game: ", error);
            }
        });
    });
});

function findGameById(id) {
    $.ajax({
        type: "GET",
        url: "/Games/findGamesById/" + id, // Assuming this endpoint finds a game by ID
        success: function (game) {
            alert("Found game successfully with ID=" + game.Gid);
            // Redirect or perform actions as needed
        },
        error: function (error) {
            console.log("Error finding game: ", error);
        }
    });
}
