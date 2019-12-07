using CoreFirstPrimer.Models.NHL;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace CoreFirstPrimer.Data
{
    public class DummyData
    {
        public static System.Collections.Generic.List<Team> getTeams()
        {

            List<Team> teams = new List<Team>()
            {
                new Team()
                {
                    TeamName="Cunkus",
                    City="Moroco",
                    Province="BC",
                },
                new Team()
                {
                    TeamName="Esperence",
                    City="Tunisia",
                    Province="BGC",
                },
                new Team()
                {
                    TeamName="Club CA",
                    City="Libie",
                    Province="BCT",
                },


            };
            return teams;
        }


        public static List<Player> getPlayers(NhlContext context)
        {

            List<Player> players = new List<Player>()
            {
                new Player()
                {
                    FirstName="amina",
                    LastName="fekht",
                    TeamName=context.Teams.Find("Esperence").TeamName,
                    position="Defense",

                },
                new Player()
                {
                    FirstName="Barbouche",
                    LastName="Ahmed",
                    TeamName=context.Teams.Find("Cunkus").TeamName,
                    position="AC",

                },
                new Player()
                {
                    FirstName="mehez",
                    LastName="Ali",
                    TeamName=context.Teams.Find("Club CA").TeamName,
                    position="ML",

                },


            };
            return players;
        }
    }
}