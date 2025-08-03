import React from 'react';
import { blogs } from '../data/blogs';

const BlogDetails = () => {
  const content = (
    <ul>
      {blogs.map((blog, index) => (
        <div key={index}>
          <h3>{blog.title}</h3>
          <strong>{blog.author}</strong>
          <p>{blog.content}</p>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="vl">
      <h1>Blog Details</h1>
      {content}
    </div>
  );
};

export default BlogDetails;
