// A simple example using async/await and Promise.all to fetch user data

const fetch = require('node-fetch'); // Assuming you're running this in a Node.js environment

const BASE_URL = 'https://jsonplaceholder.typicode.com/users';

// Function to fetch user data
async function fetchUserData() {
    try {
        const response = await fetch(BASE_URL);
        if (!response.ok) {
            throw new Error(`HTTP error! Status: ${response.status}`);
        }
        const users = await response.json();
        return users;
    } catch (error) {
        console.error('Error fetching user data:', error);
        return [];
    }
}

// Function to process user data
function processUserData(users) {
    return users.map(user => ({
        id: user.id,
        name: user.name,
        email: user.email,
        phone: user.phone,
    }));
}

// Main function
(async () => {
    const users = await fetchUserData();
    const processedUsers = processUserData(users);

    console.log('Processed Users:', processedUsers);
})();
