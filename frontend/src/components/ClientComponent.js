import React from "react";
import ClientService from '../services/ClientService'

class ClientComponent extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            clients: []
        }
    }

    componentDidMount() {
        ClientService.getClients().then((response) => {

            this.setState({ clients: response.data })

        });
    }

    render() {
        return (

            <div>
                <h1 className="text-center">Clients List</h1>
                <table className="table table-stripped">

                    <thead>
                        <tr key="">
                            <td> Client Id</td>
                            <td> Client First Name</td>
                            <td> Client Last Name</td>
                            <td> Client Email Id</td>
                        </tr>

                    </thead>

                    <tbody>
                        {
                            this.state.clients.map(
                                client =>
                                    <tr key="{user.id}">

                                        <td>{client.id}</td>
                                        <td>{client.firstName}</td>
                                        <td>{client.lastName}</td>
                                        <td>{client.email}</td>
                                    </tr>
                            )
                        }

                    </tbody>

                </table>
            </div>

        )
    }
}


export default ClientComponent