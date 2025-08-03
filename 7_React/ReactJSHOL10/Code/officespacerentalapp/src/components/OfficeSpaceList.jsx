import React from "react";


export default function OfficeSpaceList() {
  return (
    <div style={{
      display: 'flex',
      flexDirection: 'column',
      alignItems: 'center',
      justifyContent: 'center',
      padding: '20px'
    }}>
      <h3>Office Spaces, at Affordable Range</h3>
            <img src="/Office.png" alt="office image" style={{maxWidth: '300px', height: 'auto'}} />
            <br />
            <strong>Name:</strong>  Central Plaza <br />
            <strong>Address:</strong> 23 Main St, Downtown <br />
          
    </div>
  );
}