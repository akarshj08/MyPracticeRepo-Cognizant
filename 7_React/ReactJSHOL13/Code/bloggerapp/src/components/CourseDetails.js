import React from 'react';
import { courses } from '../data/courses';

const CourseDetails = () => {
  const coursedet = (
    <ul>
      {courses.map((course, index) => (
        <div key={index}>
          <h3>{course.name}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </ul>
  );

  return (
    <div className="mystyle1">
      <h1>Course Details</h1>
      {coursedet}
    </div>
  );
};

export default CourseDetails;
