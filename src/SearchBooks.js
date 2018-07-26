import React from 'react';
import * as BooksAPI from './BooksAPI';

class SearchBooks extends React.Component{
    
    constructor(props){
        super(props);
    
        this.state = {
        
            books: [],
            query: '',
            bookID : 1
        }

        this.handleChange = this.handleChange.bind(this)
        this.handleClick = this.handleClick.bind(this)
    }

    changeQuery = ((text) =>{
        BooksAPI.get(this.state.bookID).then((books) => {
            if (!books || books.hasOwnProperty('error')){
                this.setState({books: [] });
            } else{
                this.setState({books:books});
            }
        });
    });

    handleChange(event){
        this.setState({[event.target.name]: event.target.value});
    }

    handleClick(event){
        this.changeQuery(this.state.query)
    }

    render(){
        return(
            <div>
            <input name = "query" type="text" value={this.state.query} onChange={this.handleChange}/>
        
        <input type = "button" value = "Search" onClick = {this.handleClick} />
            

        {this.state.books.map((book) =>(
            
        <p>
            {JSON.stringify({book})}
        </p>
        )   
        )

        }
        </div>
        )
    }
}

    export default SearchBooks