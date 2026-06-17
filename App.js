import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import {useState} from "react";
function App() {
  //Use State
  const [showEmp,setShowEmp]=useState(false);
  const [showForm,setShowForm]=useState(false);
  return (
    
    <div>
      <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
          <a className="navbar-brand" href="#">
            Employee Management
          </a>

          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarSupportedContent"
          >
            <span className="navbar-toggler-icon"></span>
          </button>

          <div
            className="collapse navbar-collapse"
            id="navbarSupportedContent"
          >
            <ul className="navbar-nav ms-auto">

              <li className="nav-item">
                <a className="nav-link active" href="#">
                  Dashboard
                </a>
              </li>

              <li className="nav-item">
                <a className="nav-link" href="#">
                  Employees
                </a>
              </li>

              <li className="nav-item">
                <a className="nav-link" href="#">
                  Add Employee
                </a>
              </li>

              <li className="nav-item">
                <a className="nav-link" href="#">
                  Contact
                </a>
              </li>

            </ul>
          </div>
        </div>
      </nav>

      <div className="container mt-5 text-center">
        <h1>Employee Management System</h1>
        <p className="lead">
          Welcome to Employee Management Dashboard
        </p>

        <button className="btn btn-success me-2"
        onClick={()=>setShowForm(true)}
        >
          
          Add New Employee
        </button>
         <button className="btn btn-success me-2">
          Update Employee
        </button>
         <button className="btn btn-success me-2">
          Search Employee
        </button>
         <button className="btn btn-success me-2">
          Delete Employee
        </button>
         <button className="btn btn-success"
         onClick={()=>setShowEmp(true)}
         >
          Show Employee
        </button>
        {
          showEmp&&(
            <div className="Container mt-5">
              <h3>Employee Data</h3>
              </div>
          )
        }
        {
  showForm && (
    <div className="container mt-4">
      <h3>Add Employee</h3>

      <input
        type="text"
        className="form-control mb-2"
        placeholder="Enter Employee ID"
      />

      <input
        type="text"
        className="form-control mb-2"
        placeholder="Enter Employee Name"
      />

      <input
        type="text"
        className="form-control mb-2"
        placeholder="Enter Department"
      />

      <button className="btn btn-primary">
        Submit
      </button>
    </div>
  )
}
      </div>
    </div>
  );
}

export default App;
