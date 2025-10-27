import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int arr[]=new int[x];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        int maxsum=arr[0];
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            maxsum=Math.max(maxsum+arr[i],arr[i]);
            res=Math.max(res,maxsum);
        }
        System.out.print(res);
    }
}
// import React, { useState } from 'react';
//import './App.css';

const TodoItem = ({ todo, toggle }) => (
  <li
    onClick={toggle}
    style={{
      textDecoration: todo.completed ? 'line-through' : 'none',
      cursor: 'pointer',
      listStyle: 'none',
      margin: '6px 0'
    }}
  >
    {todo.text}
  </li>
);

const TodoList = () => {
  const [todos, setTodos] = useState([
    { id: 1, text: 'Learn React', completed: false },
    { id: 2, text: 'Build a to-do app', completed: false },
    { id: 3, text: 'Master JavaScript', completed: false },
  ]);

  const toggleTodo = (id) =>
    setTodos(todos.map(t => 
      t.id === id ? { ...t, completed: !t.completed } : t
    ));

  return (
    <ul style={{ padding: 0 }}>
      {todos.map(todo => (
        <TodoItem key={todo.id} todo={todo} toggle={() => toggleTodo(todo.id)} />
      ))}
    </ul>
  );
};

const App = () => (
  <div className="app-container" style={{ textAlign: 'center', marginTop: '50px' }}>
    <h1 className="app-title">My To-Do List</h1>
    <TodoList />
  </div>
);

// import React, { useState } from 'react';

const items = [
  { id: 1, name: 'Apple', price: 10 },
  { id: 2, name: 'Banana', price: 5 },
  { id: 3, name: 'Orange', price: 20 },
  { id: 4, name: 'Papaya', price: 15 }
];

export default function App() {
  const [cart, setCart] = useState([]);
  const total = cart.reduce((sum, i) => sum + i.price, 0);

  return (
    <div>
      <h2>Shopping Cart</h2>
      {items.map(i => (
        <div key={i.id}>
          {i.name} - {'$' + i.price}
          <button onClick={() => setCart([...cart, i])}>Add</button>
        </div>
      ))}
      <h3>Cart:</h3>
      {cart.map((i, idx) => (
        <div key={idx}>{i.name} - {'$' + i.price}</div>
      ))}
      {cart.length > 0 && <h3>Total: {'$' + total}</h3>}
    </div>
  );
}

