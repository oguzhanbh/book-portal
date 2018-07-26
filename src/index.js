import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import registerServiceWorker from './registerServiceWorker';
import SearchBooks from './SearchBooks';
import SearchUsers from './SearchUsers'

ReactDOM.render(<SearchUsers />, document.getElementById('root'));
registerServiceWorker();
