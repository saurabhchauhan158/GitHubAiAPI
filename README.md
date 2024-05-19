# GitHub Pull Request AI Reviewer

## Overview

The GitHub Pull Request AI Reviewer is a tool designed to facilitate code reviews by leveraging AI to provide preliminary insights on pull requests. This project includes a Go-based backend server and an HTML frontend interface to interact with GitHub repositories, manage pull requests, and generate review comments.

## Features

- **Repository Existence Check:** Verifies if a specified repository exists.
- **Pull Request Management:** Fetches the latest pull request and its associated diff files.
- **AI Review Integration:** Sends pull request diffs to an AI system for review and displays the results.
- **Error Handling:** Gracefully handles scenarios like missing pull requests or diff files.

## Owner
Saurabh Chauhan

## Getting Started

### Prerequisites

- Go (version 1.16 or higher)
- Git
- A GitHub account with an API token
- Access to the AI review system (URL: `http://ah-knathan-m.dhcp.mathworks.com:8082/mwai/api`)

### Installation

1. **Clone the repository:**
    ```bash
    git clone https://github.com/saurabhchauhan158/ai-reviewer.git
    cd ai-reviewer
    ```

2. **Install dependencies:**
    Ensure you have Go installed. No additional dependencies are required.

### Configuration

1. **Set up environment variables:**
    ```bash
    export GITHUB_TOKEN= <provide Token here>
    export GITHUB_USERNAME=saurabhchauhan158
    ```

### Running the Server

1. **Start the backend server:**
    ```bash
    go run server.go
    ```

2. **Open the frontend interface:**
    Open `index.html` in a web browser.

## Usage

1. **Check Repository Existence:**
    - Input the repository name and click "Check Repository."

2. **Fetch Latest Pull Request:**
    - After confirming the repository exists, click "Get Latest Pull Request."

3. **Fetch Diff Files:**
    - If a pull request exists, click "Get Diff Files."

4. **Send to AI for Review:**
    - Click "Send for AI Review" to get AI-generated review comments.

## Error Handling

- **Non-existent Repository:**
    - The system exits with a specific message if the repository doesn't exist.
    
- **No Pull Request:**
    - Displays a message if there are no pull requests available.

- **No Diff Files:**
    - Notifies if no diff files are found for the pull request.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Disclaimer

Disclaimer: This code review has been conducted by an AI system to provide preliminary insights. It is essential that a human reviewer conducts a thorough examination to ensure the accuracy and quality of the code before final approval.
