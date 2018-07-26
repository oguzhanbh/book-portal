import React from "react"
import * as UsersAPI from './UsersAPI'


class SearchUsers extends React.Component{
    constructor(props){
        super(props)
        this.state = {
            users:[],
            allUsers:[],
            query:'',
            searchId:1,
        }
        this.changeHandler = this.changeHandler.bind(this)
        this.clickHandler = this.clickHandler.bind(this)
        this.clickHandler2 = this.clickHandler2.bind(this)
        this.changeQuery = this.changeQuery.bind(this)
        this.changeQuery2 = this.changeQuery2.bind(this)
        this.changeQuery3 = this.changeQuery3.bind(this)
    }
  /*  
    componentDidMount(){
        UsersAPI.getAll().then((users)=>{
            if(!users){
                this.setState({users:[""]})
            }else{
                this.setState({users:users})
            }
        })
    }
*/
    changeHandler(event){
        this.setState({[event.target.name]: event.target.value})
    }


    clickHandler(event){
       this.changeQuery(this.state.query)
    }
    clickHandler2(event){
        this.changeQuery2(this.state.query)
     }

     clickHandler3(event){
        this.changeQuery(this.state.searchId)
     }
    changeQuery = ((query) => {
        UsersAPI.search(query, 100).then((users) => {
            if(!users || users.hasOwnProperty('error')) {
                this.setState({users:[""]});
            } else {
                this.setState({users: users});
            }
        });
    });

    changeQuery2 = ((query) => {
        UsersAPI.getAll().then((users) => {
            if(!users || users.hasOwnProperty('error')) {
                this.setState({allUsers:[""]});
            } else {
                this.setState({allUsers: users});
            }
        });
    });
    changeQuery3 = ((searchId) => {
        UsersAPI.get().then((users) => {
            if(!users || users.hasOwnProperty('error')) {
                this.setState({users:[""]});
            } else {
                this.setState({users: users});
            }
        });
    });
    render(){
        const { query, users, allUsers } = this.state

        return(
            <div>
                <input
                    name="query"
                    type="text"
                    onChange={this.changeHandler}
                    placeholder="Search user"
                    value={query}/>
                <button onClick={this.clickHandler}>Search</button>
                <div>
                    <ol>
                      {users.map((user) => (
                        <li>
                          <div>
                          <p>{user.userID}</p>
                          <p>{user.username}</p>
                            
                          </div>
                        </li>
                      ))}
                    </ol>
                </div>
                <div>

                <button onClick={this.clickHandler2}>get All Users</button>
                <div>
                    <ol>
                      {allUsers.map((user) => (
                        <li>
                          <div>
                          <p>{user.userID}</p>
                          <p>{user.username}</p>
                          
        
                          </div>
                        </li>
                      ))}
                    </ol>
                </div>
                
                </div>
            </div>
        )
    }
}

export default SearchUsers;