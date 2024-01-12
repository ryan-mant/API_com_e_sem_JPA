import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AtualizarLinhaComponent } from './atualizar-linha.component';

describe('AtualizarLinhaComponent', () => {
  let component: AtualizarLinhaComponent;
  let fixture: ComponentFixture<AtualizarLinhaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AtualizarLinhaComponent]
    });
    fixture = TestBed.createComponent(AtualizarLinhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
