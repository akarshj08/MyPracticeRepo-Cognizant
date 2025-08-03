import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  const handleSubmit = () => {
    const amt = parseFloat(amount);
    if (currency.toLowerCase() === 'euro') {
      alert(`Converting to Euro: Amount is €${amt / 80}`);
    } else if (currency.toLowerCase() === 'rupees') {
      alert(`Converting to Euro Amount is ₹${amt * 80}`);
    } else {
      alert('Please enter valid currency (Euro or Rupees)');
    }
  };

  return (
    <div>
      <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
      <div>
        <label>Amount: </label>
        <input value={amount} onChange={(e) => setAmount(e.target.value)} />
      </div>
      <div>
        <label>Currency: </label>
        <input value={currency} onChange={(e) => setCurrency(e.target.value)} />
      </div>
      <button onClick={handleSubmit}>Submit</button>
    </div>
  );
}

export default CurrencyConvertor;
