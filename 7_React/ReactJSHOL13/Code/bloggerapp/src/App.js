import React from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (
    <div>
      <div style={{ display: 'flex', justifyContent: 'space-evenly' }}>
        {showCourses && <CourseDetails />}
        {showBooks ? <BookDetails /> : null}
        {showBlogs && <BlogDetails />}
      </div>
    </div>
  );
}

export default App;
