# Orchestration (`orchestration`)

> Workflow engine built on **Orkes Conductor**, coordinating payment execution with retries, timeouts, and compensation logic.  

## 1) Overview
This service manages **workflows** for payments, refunds, and reconciliation.  
It ensures reliable execution across distributed services and supports retries and compensating transactions.  

**Responsibilities**
- Define and execute Orkes workflows  
- Resume workflows on webhook callbacks  
- Handle retries, timeouts, and compensation  
- Expose operational APIs for monitoring/recovery  


## 2) Functional Requirements
- **FR1 (Workflow Execution):** Core engine for payment flows  
- **FR2 (Webhook Handling):** Resumes workflows after Moov callbacks  
- **FR3 (Reconciliation):** Runs reconciliation as a scheduled workflow  
- **FR4 (Refunds & Cancellations):** Compensation workflows  
- **FR5 (Ops Visibility):** Workflow status queries + dashboards  

## 3) Workflow Types
- `PaymentWorkflow` → happy-path payment execution  
- `RefundWorkflow` → OPA-validated refunds  
- `ReconciliationWorkflow` → ledger vs Moov comparison  


## 4) Tech Stack
- Orkes Conductor  
- Java 17 + Spring Boot worker services  
- Postgres for workflow persistence  
- Exposes APIs via contracts repo  


## 5) License
MIT
