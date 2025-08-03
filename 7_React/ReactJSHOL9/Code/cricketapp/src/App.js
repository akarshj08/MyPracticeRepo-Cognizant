// src/App.js
import React, { useState } from "react";
import ListOfPlayers from "./components/ListofPlayers";
import IndianPlayersCom from "./components/IndianPlayers";

export default function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div>
      <button onClick={() => setFlag(f => !f)}>
        Toggle View (Current: {flag ? "Players" : "Indian Players"})
      </button>
      {flag
        ? <ListOfPlayers />
        : <IndianPlayersCom />}
    </div>
  );
}
