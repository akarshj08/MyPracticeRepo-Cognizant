import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [count, setCount] = useState(5);

  const increment = () => {
    setCount(count + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayHello = () => {
    alert("localhost:3000 says\nHello! Member1");
  };

  const sayMessage = (msg) => {
    alert(`localhost:3000 says\n${msg}`);
  };

  const handleClick = () => {
    alert("localhost:3000 says\nI was clicked");
  };

  return (
    <div  style={{ paddingLeft: '20px' }}>
      <h3>{count}</h3>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayMessage("welcome")}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
