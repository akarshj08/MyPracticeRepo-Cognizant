import React from "react";

const players = [
  { name: "Jack", score: 30 },
  { name: "Bob", score: 70 },
  { name: "Steve", score: 90 },
  { name: "John", score: 60 },
  { name: "Sam", score: 50 },
  { name: "Paul", score: 80 },
  { name: "Will", score: 40 },
  { name: "Smith", score: 75 },
  { name: "Joseph", score: 64 },
  { name: "Clark", score: 95 },
  { name: "Max", score: 68 }
];

const playersBelow70 = players.filter((item) => item.score < 70);

export default function ListOfPlayers() {
  return (
    <div>
      <h3>List of Players</h3>
      <ul>
        {players.map((item, idx) => (
          <li key={idx}>{item.name} <span>({item.score})</span></li>
        ))}
      </ul>

      <h3>List of Players having Scores Less than 70</h3>
      <ul>
        {playersBelow70.map((item, idx) => (
          <li key={idx}>{item.name} <span>({item.score})</span></li>
        ))}
      </ul>
    </div>
  );
}
