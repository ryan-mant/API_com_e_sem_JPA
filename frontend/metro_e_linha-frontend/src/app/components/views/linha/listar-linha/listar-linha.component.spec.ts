import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListarLinhaComponent } from './listar-linha.component';

describe('ListarLinhaComponent', () => {
  let component: ListarLinhaComponent;
  let fixture: ComponentFixture<ListarLinhaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ListarLinhaComponent]
    });
    fixture = TestBed.createComponent(ListarLinhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
