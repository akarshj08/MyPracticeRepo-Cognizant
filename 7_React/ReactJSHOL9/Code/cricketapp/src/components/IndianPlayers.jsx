import React from "react";


const T20Players = ["First Player", "Second Player", "Third Player"];
const RanjiTrophyPlayers = ["Fourth Player", "Fifth Player", "Sixth Player"];
const IndianPlayers = [...T20Players, ...RanjiTrophyPlayers];

function OddPlayers({ players }) {
  const [first, , third] = players;
  return (
    <div>
      <h4>Odd Players</h4>
      <ul>
        <li>{first}</li>
        <li>{third}</li>
      </ul>
    </div>
  );
}

function EvenPlayers({ players }) {
  const [second, , fourth] = players;
  return (
    <div>
      <h4>Even Players</h4>
      <ul>
        <li>{second}</li>
        <li>{fourth}</li>
      </ul>
    </div>
  );
}

function ListOfIndianPlayers({ players }) {
  return (
    <div>
      <h4>List of Indian Players Merged:</h4>
      <ul>
      
        {players.map((item, idx) => (
          <li key={idx}>{item}</li>
        ))}
      </ul>
    </div>
  );
}

export default function IndianPlayersCom() {
  return (
    <div>
      <h3>Indian Team</h3>
      <OddPlayers players={T20Players} />
      <EvenPlayers players={RanjiTrophyPlayers} />
      <ListOfIndianPlayers players={IndianPlayers} />
    </div>
  );
}
