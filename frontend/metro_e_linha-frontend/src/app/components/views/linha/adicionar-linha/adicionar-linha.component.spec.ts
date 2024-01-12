import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdicionarLinhaComponent } from './adicionar-linha.component';

describe('AdicionarLinhaComponent', () => {
  let component: AdicionarLinhaComponent;
  let fixture: ComponentFixture<AdicionarLinhaComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [AdicionarLinhaComponent]
    });
    fixture = TestBed.createComponent(AdicionarLinhaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
