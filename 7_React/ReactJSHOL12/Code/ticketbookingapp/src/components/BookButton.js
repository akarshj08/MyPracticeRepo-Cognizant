// src/components/BookButton.js
import React from 'react';

const BookButton = ({ isLoggedIn }) => {
  if (!isLoggedIn) return null;
  return <button>Book</button>;
};

export default BookButton;
